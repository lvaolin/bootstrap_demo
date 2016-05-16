import java.security.MessageDigest;

/**
 * Created by admin on 2016/5/16.
 */
public class MD5Util {

    /**
     * 对字符串加密
     *
     * @param s
     *            String
     * @return String
     */
    public final static String MD5(String s) {
        char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'a', 'b', 'c', 'd', 'e', 'f' };
        try {
            byte[] strTemp = s.getBytes();
            MessageDigest mdTemp = MessageDigest.getInstance("MD5");
            mdTemp.update(strTemp);
            byte[] md = mdTemp.digest();
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            return null;
        }
    }

    public static void main(String[] args) {
        try {
            String username ="lvaolin";
            String password = "12345";
            System.out.println(password+"--->加密  "+MD5(password));
            System.out.println(password+"--->加盐加密  "+MD5(password+"{"+username+"}"));
//加盐的原因是防止MD5加密串反向查询
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
