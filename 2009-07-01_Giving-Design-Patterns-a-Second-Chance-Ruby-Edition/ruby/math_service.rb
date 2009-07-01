class MathService
  def add(x, y)
    puts "Result (#{x} + #{y}): #{x + y}"
  end

  def subtract(x, y)
    puts "Result (#{x} - #{y}): #{x - y}"
  end
end

class MathServiceProxy
  def initialize(math_service)
    @delegate = math_service
  end

  def method_missing(name, *args)
    puts "Call made to the #{name} method"
    @delegate.send(name, *args)
  end
end

ms = MathServiceProxy.new(MathService.new)
ms.add(1,2)
ms.subtract(4,3)