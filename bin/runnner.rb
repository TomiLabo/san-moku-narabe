input_data = ''
(0..100).each { input_data << Random.rand(3).to_s << "\n" }

File.write('input.txt', input_data)

pid = spawn('java Game -classpath ./src', in: 'input.txt', out: '/dev/stdout', err: '/dev/stderr')
Process.detach(pid)
