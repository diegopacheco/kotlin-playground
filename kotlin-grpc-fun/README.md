### Build
1. generate the protos
```bash
cd contract/
gradle build
```
### Test
2. first run the server main app
```bash
grpcurl -import-path ./contract/src/main/proto/ -proto hello_world.proto list
helloworld.Greeter
```
```bash
grpcurl -plaintext -import-path ./contract/src/main/proto/ -proto hello_world.proto -d '{"name":"hi"}' localhost:50051 helloworld.Greeter/SayHello
```
