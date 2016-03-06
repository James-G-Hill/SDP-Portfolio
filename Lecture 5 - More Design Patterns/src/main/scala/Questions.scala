package Strategy

// Q1.a. Describe the Strategy Design Pattern
//
// The strategy design pattern includes an interface for a set of classes
// that define different algorithms.  These are all interchangeable.  The
// interface is then referenced within a class which can use these
// different algorithms interchangeably.
// 
// Q1.b.
// 
// The strategy design pattern should be used when you need to define a
// number of classes that differ only in their behaviour and should be
// used interchangeably so that different algorithms can be used at runtime.
// 
// Q3
// 
// The abstract factory design pattern should be used when the application
// needs to be able to produce distinct sets of related objects; the client
// can interact with many different similar concrete factories to produce
// concrete objects that it can work with; the client doesn't need to reference
// the concrete objects as it always works through interfaces.
// 
// Q5
// 
// A problem with keeping object construction details within the object,
// and particularly within the constructor, is that the constructor becomes
// extraordinarily complex if the object is complex (this is called constructor
// bloat) and having all of the code within the object makes it less modular.
// 
// Q7.a.
// 
// The Facade pattern is used as a simplified interface to a complex piece of 
// code.
// 
// Q7.b.
// 
// The Facade pattern is used if: a simplified interface is required for a
// complex system; abstractions and implementations of a sybsystem are tightly
// coupled; an entry point is needed for multiple levels of layered software;
// a system is very complex or difficult to understand.
// 
// Q9
// 
// You should use the bridge design pattern when you have a proliferation of
// classes resulting from a coupled interface and numerous implementations
// resulting from the need to map orthoganol class hierarchies.
// 
// Q11.a
// 
// The composite pattern creates an interface that allows individual objects
// and groups of the same object to be manipulated with a single set of methods.
// 
// Q11.b
// 
// The composite pattern should be used when multiple objects need to be treated
// in the same way and have nearly identical code to handle them.
// 
// Q11.c
// 
// The four participants of a composite design pattern are: Component; Leaf;
// Composite; and Client.