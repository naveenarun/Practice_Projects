defmodule Q14 do
  def collatz(n) do
    collatz(n, 1, %{})
  end

  def collatz(1, count, _), do: count

  def collatz(n, count, d) do
    myArchive = if Map.has_key?(d, n) do
      Map.get(d, n)
    else
      0
    end

    if myArchive == 0 do
      next = if rem(n, 2)==0 do
        div(n,2)
      else
        3*n+1
      end
      d_new = Map.put(d, next, collatz(next, count+1, d))
      Map.get(d_new, next)
    else
      myArchive
    end
  end
end

IO.inspect 1..1000000 |> Enum.map(&([&1, Q14.collatz(&1)])) |> Enum.max_by(&(Enum.at(&1,1)))
