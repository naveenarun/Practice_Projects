defmodule Q19 do
  def countSundays() do
    countSundays(0, 0, 1901, 31, 11, 2000, 1, 0)
  end

  def countSundays(cd, cm, cy, ud, um, uy, cday, count) do
    daysPerMonth = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    if (cm==um and cy==uy and cd>ud) or (cy==uy and cm>um) or cy > uy do
      count
    else
      count = if rem(cday,7)==6 and cd==0 do
        count + 1
      else
        count
      end

      daysThisMonth = if cm == 1 and ((rem(cy,4)==0 and rem(cy,100)!=0) or rem(cy, 400)==0) do
        29
      else
        Enum.at(daysPerMonth, cm)
      end

      incrMonth? = rem(cd+1, daysThisMonth)==0
      incrYear? = incrMonth? and rem(cm+1, 12)==0

      nd = rem(cd+1, daysThisMonth)
      nm = if incrMonth? do
        rem(cm+1, 12)
      else
        cm
      end
      ny = if incrYear? do
        cy+1
      else
        cy
      end

      nday = rem(cday + 1, 7)

      countSundays(nd, nm, ny, ud, um, uy, nday, count)
    end
  end
end

IO.inspect Q19.countSundays()
