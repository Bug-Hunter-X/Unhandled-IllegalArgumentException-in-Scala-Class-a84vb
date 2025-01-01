# Unhandled IllegalArgumentException in Scala

This repository demonstrates a common error in Scala: an unhandled `IllegalArgumentException`. The `MyClass` has a setter for `age` that throws an exception if a negative age is provided. The `Main` object attempts to set a negative age and the exception is not caught, causing the program to terminate.