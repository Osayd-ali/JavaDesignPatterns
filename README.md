# Design Patterns Implementation
This project demonstrates two fundamental design patterns: Modified Singleton Pattern and Abstract Factory Pattern. Each implementation showcases different aspects of object-oriented design principles and pattern usage.

# System Design (UML)
<img width="1088" alt="Screenshot 2024-11-13 at 12 24 51 AM" src="https://github.com/user-attachments/assets/0f45589a-a758-410a-9080-3cae21b1941f">


# Part 1: Modified Singleton Pattern
An exploration of a modified Singleton pattern that manages exactly three instances instead of the traditional single instance approach. The project implements two variations of this pattern to demonstrate different initialization strategies.

# Lazy Singleton
  * Concept: Instances are created only when first requested
  * Key Features: * On-demand instance creation
                  * Thread-safety management
                  * Delayed resource allocation
                  * Instance tracking mechanism
# Eager Singleton
  * Concept: All instances are created during class initialization
  * Key Features: * Immediate instance availability
                  * Inherent thread safety
                  * Predictable memory usage
                  * No synchronization overhead

# Part 2: GUI Framework Using Abstract Factory
A cross-platform GUI framework implementation that demonstrates the Abstract Factory pattern. The system creates platform-specific UI components while maintaining a consistent interface across different operating systems.

# Design Architecture
# Factory Layer
 * Abstract GUI Factory Interface
 * Platform-Specific Factory Implementations
 * Component Creation Protocols
# Component Layer
 * Abstract Component Definitions
 * Platform-Specific Implementations
 * Rendering Mechanisms

# Design Considerations
 * Platform independence
 * Extensibility for new platforms
 * Interface consistency
 * Factory method implementations
 * Component lifecycle management
