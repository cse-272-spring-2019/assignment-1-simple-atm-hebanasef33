public class logic {

public int balance ;
public int counter=0 ;
public String []mystring = new String[15] ;


    public void deposit(int depositamount )
{
    balance = balance + depositamount ;

    mystring[counter]="ammount deposit = "+ depositamount  ;
    counter ++ ;
}
public int withdraw (int withdrawamount)
{ if(balance==0||balance<withdrawamount)
        return 0 ;
    else
{ balance = balance - withdrawamount ;
    mystring[counter]="ammount withdraw = " + withdrawamount  ;
    counter ++ ;
    return 1;    }
}


public void  balance ()
{

    mystring[counter]=" displaying balance  = " + balance  ;
    counter ++ ;
}

    public String[] getMystring() {
        return mystring;
    }
    public int getCounter() {
        return counter;
    }
    public int func1 ()
{
    counter -- ;
    return counter ;
}

public int func2 ()
{
    counter ++ ;
    return counter ;

}

}
