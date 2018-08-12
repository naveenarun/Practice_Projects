defmodule Q21 do
  def sumPairsUpTo(upper) do
    sumPairsUpTo(1, upper, 0)
  end

  def sumPairsUpTo(curr, upper, acc) do
    new = factorsum(curr)
    if curr > upper do
      acc
    else
      if factorsum(new) == curr and new != curr do
        sumPairsUpTo(curr + 1, upper, acc+curr)
      else
        sumPairsUpTo(curr + 1, upper, acc)
      end
    end
  end

  def factorsum(n) do
    factorsum(n, 2, [1]) |> Enum.sum
  end

  def factorsum(n, curr, fs) do
    cond do
      curr*curr == n -> fs ++ [curr]
      curr > :math.sqrt(n) -> fs
      rem(n, curr) == 0 -> factorsum(n, curr+1, fs ++ [curr] ++ [div(n, curr)])
      true -> factorsum(n, curr+1, fs)
    end
  end
end

IO.inspect Q21.sumPairsUpTo(10000)
