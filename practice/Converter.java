
public class Converter
{
    int m_base;
    public Converter(int base)
    {
        m_base=base;
    }
    int BasetoDecimal(String in)
    {
        return BasetoDecimal(in,m_base);
    }

    int BasetoDecimal(String in, int base)
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

    public static void main(String[] args)
    {
        Converter c = new Converter(8);
        System.out.println(c.BasetoDecimal("17"));
    }
}
