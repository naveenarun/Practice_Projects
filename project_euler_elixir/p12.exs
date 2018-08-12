defmodule Q12 do
  def divisorlist(n) do
    divisorlist(n, [], 2)
  end

  def divisorlist(n, dlist, curr) do
    cond do
      n == 1 -> dlist
      rem(n, curr) == 0 -> divisorlist(div(n, curr), dlist++[curr], 2)
      true -> divisorlist(n, dlist, curr+1)
    end
  end

  def dlist_to_numd(dlist) do
    len = length(dlist)
    cond do
      len==0 -> 1
      len==1 -> 2
      true -> [h | t] = dlist
              dlist_to_numd(t, 1, 1, h)
    end
  end

  def dlist_to_numd(dlist, acc, count, curr) do
    if dlist == [] do
      acc*(count+1)
    else
      [head | tail] = dlist
      cond do
        curr != head -> dlist_to_numd(tail, acc*(count+1), 1, head)
        curr == head -> dlist_to_numd(tail, acc, count+1, head)
      end
    end
  end

  def numd(n), do: dlist_to_numd(divisorlist(n))

  def solve() do
    solve(1)
  end

  def solve(n) do
    tri = div(n*(n+1),2)
    numdiv = numd(tri)
    if numdiv > 500 do
      tri
    else
      solve(n+1)
    end
  end
end

IO.inspect Q12.solve()
