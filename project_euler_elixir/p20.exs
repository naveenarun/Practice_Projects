IO.puts 1..100 |> Enum.reduce(&(&1*&2)) |> to_charlist |> Enum.map(&(&1-48)) |> Enum.sum
