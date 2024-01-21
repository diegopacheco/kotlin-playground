class DoNotExtendMEImFinalBeyatche

// 
// IF you do this : compilation error!
//
// class DoesItwork : DoNotExtendMEImFinalBeyatche
//
// This type is final, so it cannot be inherited from
//

/**
 * 
 * Kotlin has closed by default so all classes are final.
 * Which will not work with most of frameworks like spring , hibernate.
 * because they do proxies - can revert this behavior by
 * adding this dependency.
 * 
 *  <dependencies>
        <dependency>
            <groupId>org.jetbrains.kotlin</groupId>
            <artifactId>kotlin-maven-allopen</artifactId>
            <version>${kotlin.version}</version>
        </dependency>
    </dependencies>
 * 
 *  All details here: https://kotlinlang.org/docs/all-open-plugin.html#maven
 */