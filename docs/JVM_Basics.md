# JVM Basics

## JDK vs JRE vs JVM

- **JVM (Java Virtual Machine)** is the engine that actually runs Java
  bytecode. It's what turns `.class` files into real CPU instructions on
  whatever machine it's installed on, and it also manages memory (garbage
  collection), security, and thread scheduling at runtime.
- **JRE (Java Runtime Environment)** is the JVM plus the standard library
  classes (`java.lang`, `java.util`, `java.io`, etc.) needed to *run*
  already-compiled Java programs. If you only have a JRE, you can run
  `.class` files but you can't compile `.java` source files.
- **JDK (Java Development Kit)** is the JRE plus development tools —
  most importantly `javac` (the compiler), plus tools like `javadoc`,
  `jar`, and a debugger. You need the JDK to build LearnTrack from source;
  end users running only the compiled output would only need a JRE.

In short: **JDK ⊃ JRE ⊃ JVM** — each one contains the one before it, and adds
more on top.

## What is Bytecode?

When you compile a `.java` file with `javac`, it doesn't produce native
machine code for your specific CPU. Instead it produces **bytecode** —
a `.class` file containing instructions in an intermediate format that
the JVM understands. Bytecode is platform-independent; it's only when
the JVM loads and executes it that it gets translated (interpreted, or
JIT-compiled) into instructions the actual hardware can run.

## "Write Once, Run Anywhere"

Because `javac` compiles Java source into bytecode instead of directly
into machine code, the same `.class` file can run unmodified on any
machine that has a compatible JVM — Windows, macOS, Linux, whatever.
The JVM is the piece that's platform-specific (there's a different JVM
build for each OS/architecture), but the bytecode it consumes is
identical everywhere. That's the "write once, run anywhere" promise:
you compile your Java code a single time, and the resulting bytecode
is portable as long as a JVM is available on the target machine.
