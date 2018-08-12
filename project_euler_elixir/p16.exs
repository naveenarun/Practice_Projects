IO.inspect List.duplicate(2,1000) |> Enum.reduce(&(&1*&2)) |> to_charlist |> Enum.map(&(&1-48)) |> Enum.sum
