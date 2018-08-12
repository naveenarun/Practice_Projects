# Uses factorsum from Q21

defmodule Q23 do
  
  def pairSums(nlist) do
    ntuple = List.to_tuple(nlist)
    pairSums(ntuple, 0, 0, MapSet.new())
  end

  def pairSums(ntuple, idx1, idx2, mysums) do
    cond do
      idx1 == tuple_size(ntuple) -> mysums
      idx2 == tuple_size(ntuple) -> pairSums(ntuple, idx1+1, idx1+1, mysums)
      true -> pairSums(ntuple, idx1, idx2+1, MapSet.put(mysums, elem(ntuple, idx1) + elem(ntuple, idx2)))
    end
  end

  def isAbundant?(n) do
    fsum = factorsum(n, 2, [1]) |> Enum.sum
    fsum > n
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

abundants = 1..28123 |> Enum.filter(&Q23.isAbundant?/1)
abundantSums = Q23.pairSums(abundants)
ints = MapSet.new(1..28123)
diffs = MapSet.difference(ints, abundantSums)
IO.inspect diffs |> MapSet.to_list |> Enum.sum
#IO.inspect 1..100 |> Enum.map(&(Q23.existsSum?(abundants, &1)))
