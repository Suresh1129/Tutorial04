

object Q02 {

    def main(args:Array[String])
    {
        printf("Enter integer : ");
        var k = scala.io.StdIn.readInt();
        check_int(k);
        
    }
    
    def check_int(k:Int):Unit={
        k match{
            case k if k==0 => println("Zero");
            case k if k<0  => println("Negative");
            case k if k>0  => Even(k);
        }
    }
    
    def Even(k:Int):Unit={
        k%2==0 match{
            case true => println("Even");
            case false  => println("Odd");
        }
    }

}