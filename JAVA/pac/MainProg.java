import left.LeftClass;
import right.RightClass;
import left.leftfirst.LeftFirstClass;
import left.leftsecond.LeftSecondClass;
import right.rightfirst.RightFirstClass;
import right.rightsecond.RightSecondCLass;
class MainProg
      {
        public static void main(String a[])
               {
                LeftClass lc=new LeftCLass();
                RightClass rc=new RightClass();
                lc.display();
                rc.display();
          
                LeftFirstClass lfc=new LeftFirstClass();
                LeftSecondClass lsc=new LeftSecondClass();
                lfc.display();
                lsc.display();
              
                RightFirstClass rfc=new RightFirstClass();
                RightSecondClass rsc=new RightSecondClass();
                rfc.display();
                rsc.display();
               }
      } 