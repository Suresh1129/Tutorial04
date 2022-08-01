

object Q01 {
  
  
   

    def main(args:Array[String])
    {
        printf("Enter Your deposit amount : ");
        var d = scala.io.StdIn.readDouble();
        printf("Amount of interest that the money earns in a year : %.4f/=",intrst(d));

        
    }
    
     def intrst(d:Double):Double=
    {
        d match{
            case d if d<=20000 => d*0.02;
            case d if d<=200000 => d*0.04;
            case d if d<=2000000 => d*0.035;
            case d if d>2000000 => d*0.065;
        }
    }
   
}