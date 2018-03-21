package com.tasks6.rle;

public class Application
{
    public static void main( String[] args )
    {
        if (args != null && args.length != 0 && args[0] != null)
        {
            StringBuilder str = new StringBuilder("");

            if (args[0].length() != 0)
            {
                char s = args[0].charAt(0);
                int count = 1;

                for (int i = 1; i < args[0].length(); i++)
                {
                    if (args[0].charAt(i) == s)
                    {
                        if (count == 9)
                        {
                            str.append(s).append(9);
                            count = 1;
                        }

                        else
                        {
                            count++;
                        }
                    }

                    else
                    {
                        str.append(s);

                        if (count != 1)

                            str.append(count);

                        s = args[0].charAt(i);

                        count = 1;
                    }
                }

                str.append(s);

                if (count != 1)

                    str.append(count);
            }

            System.out.println(str);
        }
    }
}