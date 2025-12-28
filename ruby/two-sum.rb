def two_sum(nums, target)
  result = []
  nums.each_with_index do |n, i|
    for j in i..(nums.length - 1)
      check = j > i && nums[i] + nums[j] == target
      if check
        result[0] = i
        result[1] = j
        return result
      end
    end
  end
  result
end

print two_sum([3, 2, 4], 6)
