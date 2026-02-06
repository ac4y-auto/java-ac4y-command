# java-ac4y-command

Base command domain module for the Ac4y command pattern framework.

## Maven Dependency

```xml
<dependency>
    <groupId>ac4y</groupId>
    <artifactId>ac4y-command</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Overview

Provides the fundamental command structure with XML/JSON serialization support. Uses an algebra-domain pattern where `Ac4yCommandAlgebra` defines the structure and `Ac4yCommand` provides the serializable domain class.

## Dependencies

- `ac4y:ac4y-service-domain:1.0.0` (ac4y base classes)

## Package Structure

- `ac4y.command.algebra` - Base algebra class with command name
- `ac4y.command.domain` - JAXB-annotated domain class

## Build

```bash
mvn clean install
mvn test
```

## Origin

Extracted from `IJAc4yCommandModule/IJAc4yCommand` module.

---
**Version:** 1.0.0
