public class Garage
{
   private Car carPosition1;
   private Car carPosition2;

   public Garage()
   {
      carPosition1 = null;
      carPosition2 = null;
   }

   public boolean isParkingAreaTaken(int position)
   {
      if(position==1)
      {
         return carPosition1!=null;
      }
      else if(position==2)
      {
         return carPosition2!=null;
      }
      else
      {
         return false;
      }

      /*  return ((position == 1 && carPosition1 != null)
            || (position == 2 && carPosition2 != null));
      */

   }

   public void park(Car car, int position)
   {
      if (position == 1 && !isParkingAreaTaken(position))
      {
         carPosition1 = car;
      }
      else if (position == 2 && !isParkingAreaTaken(position))
      {
         carPosition2 = car;
      }
   }

   public Car leaveGarage(int position)
   {
      Car temp = null;

      if (position == 1)
      {
         temp = carPosition1;
         carPosition1 = null;
      }
      else if (position == 2)
      {
         temp = carPosition2;
         carPosition2 = null;
      }

      return temp;
   }

   public String toString()
   {
      String returnStr = "";

      if (carPosition1 == null)
      {
         returnStr += "Garage position1: Empty\n";
      }
      else
      {
         returnStr += "Garage position1: " + carPosition1 + "\n";
      }

      if (carPosition2 == null)
      {
         returnStr += "Garage position2: Empty";
      }
      else
      {
         returnStr += "Garage position2: " + carPosition2;
      }

      return returnStr;
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof Garage))
      {
         return false;
      }

      Garage other = (Garage) obj;

      if (carPosition1 != null && carPosition2 != null)
      {
         return carPosition1.equals(other.carPosition1)
               && carPosition2.equals(other.carPosition2);
      }
      else if (carPosition1 == null && carPosition2 == null)
      {
         return other.carPosition1 == null && other.carPosition2 == null;
      }
      else if (carPosition1 == null)
      {
         return other.carPosition1 == null
               && carPosition2.equals(other.carPosition2);
      }
      else //carPosition2 must be null if we get to the else
      {
         return other.carPosition2 == null
               && carPosition1.equals(other.carPosition1);
      }
   }
}
