package com.isuwang.soa.user.scala

        import com.github.dapeng.core._;
        import com.github.dapeng.org.apache.thrift._;
        import java.util.ServiceLoader;
        import java.util.concurrent.CompletableFuture;
        import com.isuwang.soa.user.scala.UserServiceAsyncCodec._;
        import com.isuwang.soa.user.scala.service.UserServiceAsync;
        import scala.concurrent.duration._
        import scala.concurrent.{Future, Promise}
        import scala.concurrent.ExecutionContext.Implicits.global

        /**
         * Autogenerated by Dapeng-Code-Generator (2.0.6)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        **/
        class UserServiceAsyncClient extends UserServiceAsync {

        val serviceName = "com.isuwang.soa.user.service.UserService"
        val version = "1.0.0"
        val pool = {
          val serviceLoader = ServiceLoader.load(classOf[SoaConnectionPoolFactory])
          if (serviceLoader.iterator().hasNext) {
            val poolImpl = serviceLoader.iterator().next().getPool
            poolImpl.registerClientInfo(serviceName,version)
            poolImpl
          } else null
        }

        def getServiceMetadata: String = {
          pool.send(
          serviceName,
          version,
          "getServiceMetadata",
          new getServiceMetadata_args,
          new GetServiceMetadata_argsSerializer,
          new GetServiceMetadata_resultSerializer
          ).success
        }

        /**
        *  java CompletableFuture => scala Future common function
        */
        def toScala[T,R](response: CompletableFuture[T])(extractor: T => R): Future[R] = {

          val promise = Promise[R]()
          response.whenComplete((res: T, ex) => {
            if (ex != null) promise.failure(ex)
            else promise.success(extractor(res))
          })
          promise.future
        }


        

            /**
            * 
            **/
            def createUser(user:com.isuwang.soa.user.scala.domain.User ) : Future[Unit] = {

            val response = pool.sendAsync(
            serviceName,
            version,
            "createUser",
            createUser_args(user),
            new CreateUser_argsSerializer(),
            new CreateUser_resultSerializer() ).asInstanceOf[CompletableFuture[createUser_result]]

            toScala(response)(null)

          }

          

            /**
            * 
            **/
            def getUserById(userId:Int ) : Future[com.isuwang.soa.user.scala.domain.User] = {

            val response = pool.sendAsync(
            serviceName,
            version,
            "getUserById",
            getUserById_args(userId),
            new GetUserById_argsSerializer(),
            new GetUserById_resultSerializer() ).asInstanceOf[CompletableFuture[getUserById_result]]

            toScala(response)(_.success)

          }

          
      }
      