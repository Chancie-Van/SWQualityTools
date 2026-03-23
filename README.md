# Software Development Tools

This repository's functionality depends on the [Apache Ant](https://ant.apache.org) build automation tool having already been installed.

## Usage Notes

Replace the source code in the src/ directory with the code you would like to document and analyze.

Test class names are recognized by the suffix "Test" (e.g., MainTest.java for tests of Main.java).

### Invoking and Reviewing
All documentation and analysis tools:
`ant` or `ant all`

View all results:
open the top-level index.html file in a browser window

Suppress most terminal messages, add -q or -quiet :
`ant -q` or `ant -q all`

List all available build targets:
`ant -p`

Invoke a specific target, such as 'test':
`ant test` or `ant -q test`

## Tools Included
This repository supports the following software development tools:
- <a href="https://checkstyle.sourceforge.io">Checkstyle</a> - Coding standard checker
- <a href="https://www.jacoco.org/jacoco/trunk/doc/">JaCoCo</a> - Code test-coverage reporter
- <a href="https://docs.oracle.com/en/java/javase/26/docs/specs/man/javadoc.html">Javadoc</a> - API documentation generator
- <a href="https://junit.org">JUnit</a> - Unit testing framework
- <a href="https://pmd.github.io">PMD &amp; CPD</a> - Code weakness and duplication scanner
- <a href="https://spotbugs.github.io">SpotBugs</a> - Bytecode-level bug finder

