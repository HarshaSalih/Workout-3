public class InvalidPanException extends Exception
{
    InvalidPanException(String msg)
    {
        super(msg);
    }
}
class UserDefine_Exception
{
    public static void main(String[] args)
    {
        String pan_num=args[0];
        String name=args[1];
        try
        {
            if(pan_num.charAt(4)!=name.charAt(0))
            {
                throw new InvalidPanException("Exception : Invalid PAN number");
            }
            else
            {
                System.out.println("Valid PAN number");
            }
        }
        catch (InvalidPanException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Please provide a valid number");
        }
    }
}
