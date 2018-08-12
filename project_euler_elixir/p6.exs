myrange = 1..100
IO.puts :math.pow(Enum.sum(myrange), 2) - Enum.sum(myrange |> Enum.map(&(:math.pow(&1,2))))
