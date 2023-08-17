
/**
 * Write a description of class converter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class converterstatic
{
    static final int based2 = 2;
    static final int based8 = 8;
    public static void main(String[] args)
    {
        int num = 0;
        String inputString = "17";
        num = BasetoDecimal(inputString, based8);
        System.out.println(num);
        inputString = "10111";
        num = BasetoDecimal(inputString, based2);
        System.out.println(num);
        //System.out.println(inputString.substring(inputString.length()-8));
    }

    static int BasetoDecimal(String in, int base)
    {
        int num = 0;
        int len = in.length();
        for(int i = 0; i < len ; i++)
        {
            num += Integer.parseInt(in.substring(in.length()-1)) * (int)Math.pow(base,i);
            in = in.substring(0, in.length() - 1);
        } 
        return num;
    }

}