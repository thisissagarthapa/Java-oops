# Java Object-Oriented Programming Examples

This repository showcases various Java code examples that illustrate fundamental Object-Oriented Programming (OOP) concepts. These examples demonstrate how to apply core OOP principles in Java programming.

## Table of Contents

- [Introduction](#introduction)
- [Method Overloading](#method-overloading)
- [Inheritance](#inheritance)
  - [Single-Level Inheritance](#single-level-inheritance)
  - [Multi-Level Inheritance](#multi-level-inheritance)
  - [Hierarchical Inheritance](#hierarchical-inheritance)
- [Encapsulation](#encapsulation)
- [Abstract Classes](#abstract-classes)
- [Interfaces](#interfaces)

## Introduction

Object-Oriented Programming (OOP) is a paradigm that uses objects and classes to model real-world scenarios. Java, as an object-oriented language, supports several key concepts that help in designing modular and reusable software.

## Method Overloading

Method overloading in Java allows a class to have more than one method with the same name, provided the methods differ in their parameter lists. This means you can define multiple methods with the same name but different argument types or counts, which improves code readability and reusability.

## Inheritance

Inheritance is a mechanism where a new class derives properties and behaviors (methods) from an existing class. It allows for code reuse and establishes a natural hierarchy between classes. There are different types of inheritance in Java:

### Single-Level Inheritance

In single-level inheritance, a class (child) inherits from another single class (parent). This is the simplest form of inheritance where a derived class inherits from a single base class.

### Multi-Level Inheritance

Multi-level inheritance involves a chain of inheritance where a class inherits from another class that is itself derived from another class. This creates a hierarchy of classes where each level inherits from its predecessor.

### Hierarchical Inheritance

In hierarchical inheritance, multiple classes derive from a single parent class. This means that several subclasses share a common base class and inherit its properties and methods.

## Encapsulation

Encapsulation is the concept of wrapping data (variables) and methods that operate on the data into a single unit or class. It is used to restrict direct access to some of the object's components and can protect the integrity of the data. Java provides access modifiers to control the visibility of classes, methods, and variables, which supports encapsulation.

## Abstract Classes

An abstract class in Java is a class that cannot be instantiated on its own and is meant to be subclassed. It can include abstract methods (without implementation) that must be implemented by subclasses. Abstract classes provide a way to define a common structure and behavior that can be shared by all subclasses while allowing subclasses to provide specific implementations.

## Interfaces

An interface in Java is a reference type that can contain abstract methods (without implementation), default methods (with implementation), static methods, and constants. Interfaces define a contract that implementing classes must follow. They allow for multiple inheritance of behavior, meaning a class can implement multiple interfaces and thus acquire behavior from more than one source.

## Usage

To explore and run these examples:

1. Clone the repository using `git clone https://github.com/thisissagarthapa/Java-oops.git`.
2. Navigate to the directory and compile the Java files.
3. Run the compiled classes to observe the behavior and understand the OOP concepts.

Feel free to explore the examples and modify them to see how different OOP principles work in practice.
