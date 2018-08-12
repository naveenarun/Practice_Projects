defmodule Primes do

  def sumPrimesUpTo(n, acc, curr) do
    cond do
      curr >= n -> acc
      isPrime?(curr) -> sumPrimesUpTo(n, acc+curr, curr+1)
      true -> sumPrimesUpTo(n, acc, curr+1)
    end
  end
  
  def isPrime?(a) when a<=3 do
    true
  end

  def isPrime?(a) when rem(a, 2)==0 or rem(a, 3)==0 do
    false
  end

  def isPrime?(a) do
    isPrime?(a, 3, Kernel.round(:math.sqrt(a)))
  end

  def isPrime?(a, testMe, upper) do
    cond do
      testMe > upper -> true
      rem(a, testMe) == 0 -> false
      true -> isPrime?(a, testMe+2, upper)
    end
  end
end

IO.inspect Primes.sumPrimesUpTo(2000000, 0, 2)
