import java.util.*;
import java.io.*;
class email
{
    public static int valid(String so)
    {
        int i,c=0,l; so=so.toUpperCase(); char ch; l=so.length();
        for(i=0;i<so.length();i++)
        {
            ch=so.charAt(i);
            if((ch>=65&&ch<=90)||ch=='.'||ch=='_'||ch=='-'||ch=='1'||ch=='0'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'
            ||ch=='6'||ch=='7'||ch=='8'||ch=='9')
            c++;
        }
        if(c==(l))
        return 1;
        return 0;
    }
    public static int first(String st)
    {
        int l=st.indexOf('@');
        int l1=st.lastIndexOf('@');
        int l2=0;
        l2=st.lastIndexOf('.');
        if(l1!=l)
        return 0;
        if(valid(st.substring(0,l))==1&&valid(st.substring(l+1))==1&&l2>0&&l2>l)
        return 1;
        return 0;
        
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int t,i;
        String s;
        int c=0;
        t=in.nextInt();
        for(i=0;i<t;i++)
        {
            s=in.next();
            if(first(s)==1)
            System.out.println("True");
            else System.out.println("False");
        }
    }
}