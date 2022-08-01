

object Q03 {
  
  def toUpper(name:String):String=
    {
        var name_U:String =  ("");
        for (c <- name)
        {
            var h = take_U_char(c); 
            name_U = name_U + h;
        }
        return name_U;
    }

    def take_U_char(i:Char):Char = {
        65<=i && i<=90 match{
            case true => return i;
            case false  => return i.toUpper;
        }
    }

    def toLower(name:String):String=
    {
        var name_L:String =  ("");
        for (c <- name)
        {
            var h = take_L_char(c); 
            name_L = name_L + h;
        }
        return name_L;
    }

    def take_L_char(i:Char):Char = {
        97<=i && i<=122 match{
            case true => return i;
            case false  => return i.toLower;
        }
    }

    def formatNames(name:String, fn:(String)=>String, indexList: Int*): String ={
    var testStr = ""
    if(indexList.isEmpty)
      fn(name)
    else{
      for(i<-0 until name.length)
      {
        if(indexList.contains(i))
          testStr += fn(name.charAt(i).toString)
        else
          testStr += name.charAt(i).toString
      }
      testStr
    }

    }

    def main(args:Array[String])
    {
        val name= scala.io.StdIn.readLine("Enter phrase : ")
        println(toUpper(name));
        println(toLower(name));

        println(formatNames(name, toLower, 0,2,3));
        println(formatNames(name, toUpper, 2,3,4));

        

        
    }

}