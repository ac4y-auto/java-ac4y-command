# java-ac4y-command - Architektúra Dokumentáció

## Áttekintés

Alap command domain modul az Ac4y command pattern keretrendszerhez. Algebra-domain mintát követ.

**Verzió:** 1.0.0
**Java verzió:** 1.8
**Szervezet:** ac4y-auto

## Fő Komponensek

### 1. Ac4yCommandAlgebra

**Csomag:** `ac4y.command.algebra`

Alap algebra osztály ami a command struktúrát definiálja. Az `Ac4y` base class-t terjeszti ki.

**Mezők:**
- `commandName` (String): A command neve

**Metódusok:**
- `getCommandName()`: Command név lekérdezése
- `setCommandName(String)`: Command név beállítása

### 2. Ac4yCommand

**Csomag:** `ac4y.command.domain`

JAXB `@XmlRootElement` annotált domain osztály. Az `Ac4yCommandAlgebra`-t terjeszti ki.

**Használat:**
```java
Ac4yCommand command = new Ac4yCommand();
command.setCommandName("MY_COMMAND");
String xml = command.getAsXml();
String json = command.getAsJson();
```

## Függőségek

```xml
<dependency>
    <groupId>ac4y</groupId>
    <artifactId>ac4y-service-domain</artifactId>
    <version>1.0.0</version>
</dependency>
```

## AI Agent Használati Útmutató

### Gyors Döntési Fa

**Kérdés:** Command objektum kell?
1. **Alap command** → `Ac4yCommand`
2. **Message command** → Lásd: `ac4y-message-command`
3. **Service command** → Lásd: `ac4y-service-command`

### Token-hatékony Tudás

**Mit tartalmaz:**
- Alap command algebra (commandName mező)
- JAXB XML/JSON szerializáció
- Ac4y base class integráció

**Mit NEM tartalmaz:**
- Message kezelés (ac4y-message-command)
- Service request/response (ac4y-service-command)

## Eredetileg

`IJAc4yCommandModule/IJAc4yCommand` modulból kiemelve.

---
**Utolsó frissítés:** 2026-02-06
