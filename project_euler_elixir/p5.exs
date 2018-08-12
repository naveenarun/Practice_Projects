defmodule Gcd do
  def gcd(x, 0), do: x
  def gcd(x, y), do: gcd(y, rem(x,y))
end

defmodule Q5 do
  def smallestdiv(n) when n==1, do: 1

  def smallestdiv(n) do
    prev = smallestdiv(n-1)
    nNew = trim(prev, n)
    prev * nNew
  end

  def trim(bigN, smallN) do
    smallN_gcd = Gcd.gcd(bigN, smallN)
    if smallN_gcd == 1 do
      smallN
    else
      trim(div(bigN, smallN_gcd), div(smallN, smallN_gcd))
    end
  end
end

IO.puts Q5.smallestdiv(20)
