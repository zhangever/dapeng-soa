
        package com.isuwang.soa.user.scala.service

        import com.github.dapeng.core.{Processor, Service}
        import com.github.dapeng.core.SoaGlobalTransactional

        /**
         * Autogenerated by Dapeng-Code-Generator (2.0.6)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        * 
        **/
        @Service(name ="com.isuwang.soa.user.service.UserService" , version = "1.0.0")
        @Processor(className = "com.isuwang.soa.user.scala.UserServiceCodec$Processor")
        trait UserService {
        
            /**
            * 
            **/
            
            @throws[com.github.dapeng.core.SoaException]
            def createUser(
            user: com.isuwang.soa.user.scala.domain.User ): Unit

          
            /**
            * 
            **/
            
            @throws[com.github.dapeng.core.SoaException]
            def getUserById(
            userId: Int ): com.isuwang.soa.user.scala.domain.User

          
      }
      