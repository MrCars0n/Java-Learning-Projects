import java.util.*;

public class TestFile
{
  public static void main(String args[])
  {
    String code1 = "QXByaWwgRm9vbHMhIChXaGF0LCBkaWQgeW91IHJlYWxseSBleHBlY3Qgc29tZXRoaW5nIGRpZmZlcmVudD8gSSBtaXNzIHlvdS";
    String code2 = "BhbGwuIFdlIHdpbGwgc3RhcnQgSmF2YSBuZXh0IHdlZWsuKQ==";
    String code = code1 + code2;
    
    Base64.Decoder dec = Base64.getDecoder();
    String decoded = new String(dec.decode(code));
    System.out.println(decoded);
  }
}