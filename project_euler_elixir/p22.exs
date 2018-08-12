clsum = fn cl -> Enum.reduce(cl, 0, &(&2+(&1-64))) end
nameidxprod=fn nituple ->
  {name, idx} = nituple
  clsum.(name)*(idx+1)
end

IO.inspect File.read!("p022_names.txt") |> String.split(",") |> Enum.map(&(String.replace(&1, "\"", ""))) |> Enum.sort |> Enum.map(&String.to_charlist/1) |> Stream.with_index |> Enum.map(nameidxprod) |> Enum.sum
