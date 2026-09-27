# kotlin-playground

Hands-on POCs of the Kotlin language and its ecosystem. Every project is small, self-contained and builds with Maven or Gradle.

## 👋 Basics

The first steps: hello world, the language basics and how to set up a build.

* [hello-world](hello-world/) - Hello world compiled to a Kotlin/Native binary
* [lang-basics-101](lang-basics-101/) - Functions, variables, conditionals, nullables, loops, collections, idioms, OOP, lambdas and coroutines
* [maven-kotlin-project-fun](maven-kotlin-project-fun/) - Kotlin project built with Maven
* [gradle-kotlin-project-fun](gradle-kotlin-project-fun/) - Kotlin project built with Gradle
* [idea-feature-java-to-kotlin](idea-feature-java-to-kotlin/) - IntelliJ IDEA Java to Kotlin conversion

## 🔤 Syntax & Expressions

The building blocks of everyday Kotlin code.
Expressions, loops, ranges, strings and small operators.

* [if-expressions](if-expressions/) - if as an expression that returns a value
* [try-catch-expression-fun](try-catch-expression-fun/) - try/catch as an expression that returns a value
* [loops-fun](loops-fun/) - Loops in Kotlin
* [cool-loops-fun](cool-loops-fun/) - More loop styles: ranges, steps, indices
* [open-ended-ranges-fun](open-ended-ranges-fun/) - Ranges with until
* [list-in-fun](list-in-fun/) - Membership check with the in operator
* [array-initializations-fun](array-initializations-fun/) - Ways to create and initialize arrays
* [kotlin-strings-fun](kotlin-strings-fun/) - String templates and string functions
* [regex](regex/) - Regular expressions
* [regex-builder](regex-builder/) - Building regular expressions
* [default-values-fun](default-values-fun/) - Default and named arguments
* [varargs-lambdas-args](varargs-lambdas-args/) - varargs mixed with lambda arguments
* [infix-call](infix-call/) - infix functions
* [todo-fun](todo-fun/) - TODO() to mark code that is not written yet
* [WAT](WAT/) - null + null prints "nullnull"

## 🛡️ Null Safety

Kotlin puts null into the type system.
These projects show the operators that deal with it.

* [elvis](elvis/) - The elvis operator ?:
* [double-bang-operator](double-bang-operator/) - The !! operator and why it throws
* [if-not-null](if-not-null/) - Null checks and smart casts

## 🧱 Classes & Objects

How Kotlin models data and types.
Data classes, enums, sealed hierarchies, objects and value classes.

* [oop-kotlin-fun](oop-kotlin-fun/) - Classes, inheritance and interfaces
* [closed-by-default](closed-by-default/) - Classes are final by default and why frameworks need them open
* [dataclass-fun](dataclass-fun/) - Data classes
* [data-classes-inheritance-experiments](data-classes-inheritance-experiments/) - Data classes and inheritance, what works and what does not
* [destruction](destruction/) - Destructuring declarations
* [destruction-fun](destruction-fun/) - Destructuring declarations with Gradle
* [enumclass-fun](enumclass-fun/) - Enum classes
* [enum-class-custom-props](enum-class-custom-props/) - Enums with custom properties
* [enum-companion-factory](enum-companion-factory/) - Enum lookup with a companion object factory
* [enum-when-fun](enum-when-fun/) - Enums with exhaustive when
* [sealed-classes-fun](sealed-classes-fun/) - Sealed classes
* [sealed-interfaces-exhaustive-check](sealed-interfaces-exhaustive-check/) - Sealed interfaces and exhaustive when checks
* [companionobject-fun](companionobject-fun/) - Companion objects as the Kotlin answer to Java static
* [companion-object-fun](companion-object-fun/) - Companion objects with Gradle
* [companion-object-factory](companion-object-factory/) - Factory methods on a companion object
* [anonymous-object](anonymous-object/) - Anonymous objects
* [inner-class-interface-fun](inner-class-interface-fun/) - Inner classes and interfaces
* [inline-key](inline-key/) - Value class used as a map key
* [value-class-ext-methods](value-class-ext-methods/) - Value class with extension methods
* [type-alias-fun](type-alias-fun/) - Type aliases
* [typealias-func](typealias-func/) - Type aliases for function types
* [delegated-properties-i-dont-know-how-i-feel-mostly-bad](delegated-properties-i-dont-know-how-i-feel-mostly-bad/) - Delegated properties
* [state-immutable-updates](state-immutable-updates/) - Immutable state updates with copy and StateFlow

## λ Functions & Lambdas

Functions are first class in Kotlin.
Lambdas, scope functions, extensions and receivers.

* [functions-fun](functions-fun/) - Functions in Kotlin
* [annonimous-lambda-function-java-fun](annonimous-lambda-function-java-fun/) - Anonymous functions and lambdas vs Java
* [functional-interface-fun](functional-interface-fun/) - fun interface
* [single-abstract-method-fun](single-abstract-method-fun/) - SAM conversions
* [apply-fun](apply-fun/) - The apply scope function
* [with-take-if](with-take-if/) - with and takeIf
* [also-fp-chain](also-fp-chain/) - Chaining calls with also
* [runCatching](runCatching/) - runCatching and Result
* [try-with-resources](try-with-resources/) - use as try-with-resources
* [contract-based](contract-based/) - Kotlin contracts with callsInPlace
* [evil-extensions-not-fun](evil-extensions-not-fun/) - Extension functions and how they can be abused
* [reciver-function-dsl](reciver-function-dsl/) - Functions with receiver to build a DSL
* [kotlin-dsl-fun](kotlin-dsl-fun/) - Type-safe builders DSL
* [context-receivers-di](context-receivers-di/) - Context parameters as dependency injection
* [tail-recursion](tail-recursion/) - tailrec functions
* [lazy-sequence-generation](lazy-sequence-generation/) - Lazy sequences
* [experimental-array-builder-fun](experimental-array-builder-fun/) - buildList builder
* [collection-custom-predicate](collection-custom-predicate/) - Collections filtered with custom predicates

## 🧬 Functional Programming

Functional style in Kotlin, with the standard library and with Arrow.

* [fp-kotlin-fun](fp-kotlin-fun/) - Functional programming with Kotlin
* [kotlin-fp-fun](kotlin-fp-fun/) - More functional programming with Kotlin
* [currying-fun](currying-fun/) - Currying
* [typeclass](typeclass/) - Type classes in Kotlin
* [arrow-fp-fun](arrow-fp-fun/) - Arrow functional library
* [parsix-fun](parsix-fun/) - Parsix: parse, don't validate

## 🔣 Generics

Generic types, constraints and reified type parameters.

* [kotlin-generics-fun](kotlin-generics-fun/) - Generics in Kotlin
* [generic-where](generic-where/) - Generic constraints with where
* [generic-reified-check](generic-reified-check/) - Type checks with reified generics
* [reified-fun](reified-fun/) - Inline functions with reified type parameters

## 🪞 Reflection, Annotations & Codegen

Looking at code at runtime and generating code.

* [kotlin-reflection-fun](kotlin-reflection-fun/) - Kotlin reflection
* [reflection-based-properties](reflection-based-properties/) - Reading properties with reflection
* [property-reference](property-reference/) - Property references
* [function-reference-reflection](function-reference-reflection/) - Function references with reflection
* [java-reflection-interop](java-reflection-interop/) - Java getters and fields from Kotlin properties
* [kt-annotations-fun](kt-annotations-fun/) - Annotations
* [kotlinpoet-fun](kotlinpoet-fun/) - Generating Kotlin code with KotlinPoet
* [kotlin-script-runtime](kotlin-script-runtime/) - Evaluating Kotlin script at runtime with JSR-223

## 🌊 Coroutines & Flow

Asynchronous code that reads like sequential code.

* [coroutines-15-fun](coroutines-15-fun/) - Coroutines
* [coroutines-sequence-fun](coroutines-sequence-fun/) - Coroutines and sequences
* [channel-fun](channel-fun/) - Channels
* [flow-timeout](flow-timeout/) - Flow with timeout

## 🌐 Web & Frameworks

Kotlin on the server with Spring Boot, Ktor, http4k, gRPC and Koin.

* [spring-boot-2-kotlin-fun](spring-boot-2-kotlin-fun/) - Spring Boot 2 with Kotlin
* [spring-boot-3.1-actuator-fun](spring-boot-3.1-actuator-fun/) - Spring Boot 3.1 Actuator
* [spring-boot-3.1-mustache-fun](spring-boot-3.1-mustache-fun/) - Spring Boot 3.1 with Mustache templates
* [spring-boot-3.1-response-entity](spring-boot-3.1-response-entity/) - Spring Boot 3.1 ResponseEntity
* [spring-boot-3.1-spring-data-jdbc-fun](spring-boot-3.1-spring-data-jdbc-fun/) - Spring Boot 3.1 with Spring Data JDBC
* [spring-boot-3.1-webflux-webclient-fun](spring-boot-3.1-webflux-webclient-fun/) - Spring Boot 3.1 WebFlux and WebClient
* [kotlin-2-spring-boot-3.x](kotlin-2-spring-boot-3.x/) - Kotlin 2 with Spring Boot 3.x
* [kotlin-2.3.0-java-25-spring-boot-4x-fun](kotlin-2.3.0-java-25-spring-boot-4x-fun/) - Kotlin 2.3.0, Java 25 and Spring Boot 4.x
* [ktor-fun](ktor-fun/) - Ktor
* [http4k-fun](http4k-fun/) - http4k
* [kotlin-grpc-fun](kotlin-grpc-fun/) - gRPC with Kotlin
* [kotlin-koin-di-fun](kotlin-koin-di-fun/) - Dependency injection with Koin

## 🧪 Testing

* [kotlin-junit5-fun](kotlin-junit5-fun/) - JUnit 5 with Kotlin
* [kotest-fun](kotest-fun/) - Kotest
* [assertk-fun](assertk-fun/) - AssertK assertions

## 🧮 Libraries

* [viktor-fun](viktor-fun/) - viktor: fast numeric arrays

## 📱 Multiplatform

One Kotlin codebase running on JVM, native, web and mobile.

* [KMP_fun](KMP_fun/) - Kotlin Multiplatform for Android, iOS, Web, Desktop and Server
* [kotlin-2x-kmp-calc](kotlin-2x-kmp-calc/) - Kotlin 2 Multiplatform calculator
* [kotlin-multiplataform-expected-actual-fun](kotlin-multiplataform-expected-actual-fun/) - expect and actual declarations

## 🆕 Versions

New Kotlin and Java versions working together.

* [kotlin-1.4-fun](kotlin-1.4-fun/) - Kotlin 1.4 features
* [kotlin-2-java-21](kotlin-2-java-21/) - Kotlin 2 with Java 21
* [java-25-kotlin-fun](java-25-kotlin-fun/) - Kotlin with Java 25
