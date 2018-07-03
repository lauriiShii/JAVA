java.lang.reflect.InvocationTargetException importación;
java.lang.reflect.Method importación;
java.util.HashMap importación;
java.util.Map importación;
java.util.ArrayList importación;
java.util.List importación;
java.util.prefs.Preferences de importación;

WinRegistry public class {
  // inspirado por
  // http://javabyexample.wisdomplug.com/java-concepts/34-core-java/62-java-registry-wrapper.html
  // http://www.snipcode.org/java/1-java/23-java-class-for-accessing-reading-and-writing-from-windows-registry.html
  // http://snipplr.com/view/6620/accessing-windows-registry-in-java/
  pública final int HKEY_CURRENT_USER estática = 0x80000001;
  pública final int HKEY_LOCAL_MACHINE estática = 0x80000002;
  público static final int REG_SUCCESS = 0;
  público static final int REG_NOTFOUND = 2;
  público static final int REG_ACCESSDENIED = 5;

  privado static final int KEY_ALL_ACCESS = 0xf003f;
  privado static final int KEY_READ = 0x20019;
  Preferencias estáticas privadas userRoot = Preferences.userRoot ();
  Preferencias estáticas privada SystemRoot = Preferences.systemRoot ();
  Clase estática privada <? se extiende Preferencias> userClass = userRoot.getClass ();
  Método estática privada RegOpenKey = null;
  Método estática privada RegCloseKey = null;
  Método estática privada RegQueryValueEx = null;
  Método estática privada RegEnumValue = null;
  Método estática privada RegQueryInfoKey = null;
  Método estática privada RegEnumKeyEx = null;
  Método estática privada RegCreateKeyEx = null;
  Método estática privada RegSetValueEx = null;
  Método estática privada RegDeleteKey = null;
  Método estática privada RegDeleteValue = null;

  estática {
    tratar {
      RegOpenKey = userClass.getDeclaredMethod ( "WindowsRegOpenKey",
          nueva clase [] {int.class, byte [] clase, int.class.});
      regOpenKey.setAccessible (true);
      RegCloseKey = userClass.getDeclaredMethod ( "WindowsRegCloseKey",
          nueva clase [] {} int.class);
      regCloseKey.setAccessible (true);
      RegQueryValueEx = userClass.getDeclaredMethod ( "WindowsRegQueryValueEx",
          nueva clase [] {int.class, byte [] clase.});
      regQueryValueEx.setAccessible (true);
      RegEnumValue = userClass.getDeclaredMethod ( "WindowsRegEnumValue",
          nueva clase [] {int.class, int.class, int.class});
      regEnumValue.setAccessible (true);
      RegQueryInfoKey = userClass.getDeclaredMethod ( "WindowsRegQueryInfoKey1",
          nueva clase [] {} int.class);
      regQueryInfoKey.setAccessible (true);
      RegEnumKeyEx = userClass.getDeclaredMethod (
          "WindowsRegEnumKeyEx", nueva Clase [] {int.class, int.class,
              int.class});
      regEnumKeyEx.setAccessible (true);
      RegCreateKeyEx = userClass.getDeclaredMethod (
          "WindowsRegCreateKeyEx", nueva Clase [] {int.class,
              . Byte [] Clase});
      regCreateKeyEx.setAccessible (true);
      RegSetValueEx = userClass.getDeclaredMethod (
          "WindowsRegSetValueEx", nueva Clase [] {int.class,
              .. Byte [] clase, byte [] Clase});
      regSetValueEx.setAccessible (true);
      RegDeleteValue = userClass.getDeclaredMethod (
          "WindowsRegDeleteValue", nueva Clase [] {int.class,
              . Byte [] Clase});
      regDeleteValue.setAccessible (true);
      RegDeleteKey = userClass.getDeclaredMethod (
          "WindowsRegDeleteKey", nueva Clase [] {int.class,
              . Byte [] Clase});
      regDeleteKey.setAccessible (true);
    }
    catch (Exception e) {
      e.printStackTrace ();
    }
  }

  WinRegistry privada () {}

  / **
   * Leer un valor de nombre de la clave y el valor
   * @param Hkey HKEY_CURRENT_USER / HKEY_LOCAL_MACHINE
   * @param Clave
   * @param VALUENAME
   * @return El valor
   * @throws IllegalArgumentException
   * @throws IllegalAccessException
   * @throws InvocationTargetException
   * /
  pública readString static String (int hkey, clave String, String VALUENAME)
    lanza IllegalArgumentException, IllegalAccessException,
    InvocationTargetException
  {
    si (== hkey HKEY_LOCAL_MACHINE) {
      volver readString (SystemRoot, hkey, llave, VALUENAME);
    }
    else if (hkey == HKEY_CURRENT_USER) {
      volver readString (userRoot, hkey, llave, VALUENAME);
    }
    else {
      arrojar nueva IllegalArgumentException ( "hkey =" + tecla h);
    }
  }

  / **
   * Valor (s) Leer y valor de nombre clave (s) forma dada
   * @param Hkey HKEY_CURRENT_USER / HKEY_LOCAL_MACHINE
   * @param Clave
   * @return El nombre del valor (s) más el valor (s)
   * @throws IllegalArgumentException
   * @throws IllegalAccessException
   * @throws InvocationTargetException
   * /
  public static Map <String, String> readStringValues ​​(int hkey, String key)
    lanza IllegalArgumentException, IllegalAccessException,
    InvocationTargetException
  {
    si (== hkey HKEY_LOCAL_MACHINE) {
      readStringValues ​​(SystemRoot, hkey, clave) return;
    }
    else if (hkey == HKEY_CURRENT_USER) {
      readStringValues ​​(UserRoot, hkey, clave) return;
    }
    else {
      arrojar nueva IllegalArgumentException ( "hkey =" + tecla h);
    }
  }

  / **
   * Leer el nombre (s) valor de una clave dada
   * @param Hkey HKEY_CURRENT_USER / HKEY_LOCAL_MACHINE
   * @param Clave
   * @return El nombre del valor (s)
   * @throws IllegalArgumentException
   * @throws IllegalAccessException
   * @throws InvocationTargetException
   * /
  Lista public static <cadena> readStringSubKeys (int hkey, String key)
    lanza IllegalArgumentException, IllegalAccessException,
    InvocationTargetException
  {
    si (== hkey HKEY_LOCAL_MACHINE) {
      readStringSubKeys (SystemRoot, hkey, clave) return;
    }
    else if (hkey == HKEY_CURRENT_USER) {
      readStringSubKeys (UserRoot, hkey, clave) return;
    }
    else {
      arrojar nueva IllegalArgumentException ( "hkey =" + tecla h);
    }
  }

  / **
   * Crear una clave
   * @param Hkey HKEY_CURRENT_USER / HKEY_LOCAL_MACHINE
   * @param Clave
   * @throws IllegalArgumentException
   * @throws IllegalAccessException
   * @throws InvocationTargetException
   * /
  pública createKey static void (int hkey, String key)
    lanza IllegalArgumentException, IllegalAccessException,
    InvocationTargetException
  {
    int [] ret;
    si (== hkey HKEY_LOCAL_MACHINE) {
      ret = createKey (SystemRoot, hkey, clave);
      regCloseKey.invoke (SystemRoot, nuevo Object [] {new Integer (ret [0])});
    }
    else if (hkey == HKEY_CURRENT_USER) {
      ret = createKey (userRoot, hkey, clave);
      regCloseKey.invoke (userRoot, nuevo Object [] {new Integer (ret [0])});
    }
    else {
      arrojar nueva IllegalArgumentException ( "hkey =" + tecla h);
    }
    si (r [1]! = REG_SUCCESS) {
      arrojar nueva IllegalArgumentException ( "RC =" + ret [1] + "clave =" + tecla);
    }
  }

  / **
   * Escribe un valor en una clave de nombre de pila / valor
   * @param Hkey
   * @param Clave
   * @param VALUENAME
   * @ Param valor
   * @throws IllegalArgumentException
   * @throws IllegalAccessException
   * @throws InvocationTargetException
   * /
  pública writeStringValue static void
    (Int hkey, clave String, String VALUENAME, Valor de la cadena)
    lanza IllegalArgumentException, IllegalAccessException,
    InvocationTargetException
  {
    si (== hkey HKEY_LOCAL_MACHINE) {
      writeStringValue (SystemRoot, hkey, llave, VALUENAME, valor);
    }
    else if (hkey == HKEY_CURRENT_USER) {
      writeStringValue (userRoot, hkey, llave, VALUENAME, valor);
    }
    else {
      arrojar nueva IllegalArgumentException ( "hkey =" + tecla h);
    }
  }

  / **
   * Eliminación de una clave dada
   * @param Hkey
   * @param Clave
   * @throws IllegalArgumentException
   * @throws IllegalAccessException
   * @throws InvocationTargetException
   * /
  pública DELETEKEY static void (int hkey, String key)
    lanza IllegalArgumentException, IllegalAccessException,
    InvocationTargetException
  {
    int rc = -1;
    si (== hkey HKEY_LOCAL_MACHINE) {
      rc = DELETEKEY (SystemRoot, hkey, clave);
    }
    else if (hkey == HKEY_CURRENT_USER) {
      rc = DELETEKEY (userRoot, hkey, clave);
    }
    si (rc! = REG_SUCCESS) {
      arrojar nueva IllegalArgumentException ( "RC =" + RC + "clave =" + tecla);
    }
  }

  / **
   * Eliminar un valor de una clave de nombre de pila / valor
   * @param Hkey
   * @param Clave
   * @ Param valor
   * @throws IllegalArgumentException
   * @throws IllegalAccessException
   * @throws InvocationTargetException
   * /
  pública deletevalue static void (int hkey, String key, String value)
    lanza IllegalArgumentException, IllegalAccessException,
    InvocationTargetException
  {
    int rc = -1;
    si (== hkey HKEY_LOCAL_MACHINE) {
      rc = deletevalue (SystemRoot, hkey, clave, valor);
    }
    else if (hkey == HKEY_CURRENT_USER) {
      rc = deletevalue (userRoot, hkey, clave, valor);
    }
    si (rc! = REG_SUCCESS) {
      arrojar nueva IllegalArgumentException (rc "clave =" "rc =" + + + + tecla "value =" + valor);
    }
  }

  // =====================

  private int estática deletevalue
    (Preferencias raíz, int hkey, String key, String value)
    lanza IllegalArgumentException, IllegalAccessException,
    InvocationTargetException
  {
    int [] = mangos (int []) regOpenKey.invoke (raíz, nuevo Object [] {
        new Integer (hkey), toCstr (clave), new Integer (KEY_ALL_ACCESS)});
    si (los mangos [1]! = REG_SUCCESS) {
      devuelven identificadores [1]; // Puede ser REG_NOTFOUND, REG_ACCESSDENIED
    }
    int rc = ((entero) regDeleteValue.invoke (raíz,
        nueva Object [] {
          new Integer (manijas [0]), toCstr (valor)
          })) IntValue (.);
    regCloseKey.invoke (raíz, nuevo objeto [] {new Integer (asas [0])});
    rc regresar;
  }

  privada DELETEKEY static int (Preferencias raíz, int hkey, String key)
    lanza IllegalArgumentException, IllegalAccessException,
    InvocationTargetException
  {
    int rc = ((entero) regDeleteKey.invoke (raíz,
        . Nueva Object [] {new Integer (hkey), toCstr (clave)})) intValue ();
    rc regresar; // Puede REG_NOTFOUND, REG_ACCESSDENIED, REG_SUCCESS
  }

  privada readString static String (Preferencias raíz, int hkey, String key, String value)
    lanza IllegalArgumentException, IllegalAccessException,
    InvocationTargetException
  {
    int [] = mangos (int []) regOpenKey.invoke (raíz, nuevo Object [] {
        new Integer (hkey), toCstr (clave), new Integer (KEY_READ)});
    si (los mangos [1]! = REG_SUCCESS) {
      return null;
    }
    byte [] VALB = (byte []) regQueryValueEx.invoke (raíz, nuevo Object [] {
        new Integer (asas [0]), toCstr (valor)});
    regCloseKey.invoke (raíz, nuevo objeto [] {new Integer (asas [0])});
    retorno (VALB = null new String (VALB) .trim ():? null);
  }

  Static Map <String, String> readStringValues ​​privadas
    (Preferencias raíz, int hkey, String key)
    lanza IllegalArgumentException, IllegalAccessException,
    InvocationTargetException
  {
    HashMap <String, String> Resultados = new HashMap <String, String> ();
    int [] = mangos (int []) regOpenKey.invoke (raíz, nuevo Object [] {
        new Integer (hkey), toCstr (clave), new Integer (KEY_READ)});
    si (los mangos [1]! = REG_SUCCESS) {
      return null;
    }
    int [] info = (int []) regQueryInfoKey.invoke (raíz,
        nueva Object [] {new Integer (asas [0])});

    // Int cuenta = info [2]; // recuento
    int count = info [0]; // Corrección de errores 20130112
    int maxlen = info [3]; // Valor de la longitud máx
    for (int index = 0; index <contar; índice ++) {
      byte [] name = (byte []) regEnumValue.invoke (raíz, nuevo Object [] {
          new Integer
            (Manijas [0]), new Integer (índice), new Integer (maxlen + 1)});
      = Valor de la cadena readString (hkey, llave, new String (nombre));
      results.put (new String (nombre) .trim (), valor);
    }
    regCloseKey.invoke (raíz, nuevo objeto [] {new Integer (asas [0])});
    Resultados de retorno;
  }

  Lista estática privada <cadena> readStringSubKeys
    (Preferencias raíz, int hkey, String key)
    lanza IllegalArgumentException, IllegalAccessException,
    InvocationTargetException
  {
    Lista <cadena> Resultados = new ArrayList <String> ();
    int [] = mangos (int []) regOpenKey.invoke (raíz, nuevo Object [] {
        new Integer (hkey), toCstr (clave), new Integer (KEY_READ)
        });
    si (los mangos [1]! = REG_SUCCESS) {
      return null;
    }
    int [] info = (int []) regQueryInfoKey.invoke (raíz,
        nueva Object [] {new Integer (asas [0])});

    // Int cuenta = info [2]; // recuento
    int count = info [0]; // Corrección de errores 20130112
    int maxlen = info [3]; // Valor de la longitud máx
    for (int index = 0; index <contar; índice ++) {
      byte [] name = (byte []) regEnumKeyEx.invoke (raíz, nuevo Object [] {
          new Integer
            (Manijas [0]), new Integer (índice), new Integer (maxlen + 1)
          });
      results.add (new String (nombre) .trim ());
    }
    regCloseKey.invoke (raíz, nuevo objeto [] {new Integer (asas [0])});
    Resultados de retorno;
  }

  static int privada [] createKey (Preferencias raíz, int hkey, String key)
    lanza IllegalArgumentException, IllegalAccessException,
    InvocationTargetException
  {
    volver (int []) regCreateKeyEx.invoke (raíz,
        nueva Object [] {new Integer (hkey), toCstr (clave)});
  }

  privada writeStringValue static void
    (Preferencias raíz, int hkey, clave String, String VALUENAME, Valor de la cadena)
    lanza IllegalArgumentException, IllegalAccessException,
    InvocationTargetException
  {
    int [] = mangos (int []) regOpenKey.invoke (raíz, nuevo Object [] {
        new Integer (hkey), toCstr (clave), new Integer (KEY_ALL_ACCESS)});

    regSetValueEx.invoke (raíz,
        nueva Object [] {
          new Integer (asas [0]), toCstr (VALUENAME), toCstr (valor)
          });
    regCloseKey.invoke (raíz, nuevo objeto [] {new Integer (asas [0])});
  }

  // utilidad
  byte estática privada [] toCstr (String str) {
    byte [] = new resultado byte [str.length () + 1];

    for (int i = 0; i <str.length (); i ++) {
      resultado [i] = (byte) str.charAt (i);
    }
    resultado [str.length ()] = 0;
    return resultado;
  }
}