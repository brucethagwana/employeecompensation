---
name: Feature Slice / Refactor Task
about: Refactor legacy Java calculation classes into CQRS/Event Sourcing pipeline
title: '[Refactor] Convert <LegacyClass.java> to CQRS Event Stream'
labels: 
  - refactor 
  - cqrs
---

### 📦 Source Code Impact
- **Target Java Class:** `Assets.java` / `Balance.java` / `Benefits.java` / `Deductions.java` / `OtherDeductions.java`
- **Bounded Context:** Tax Levy / Employee Compensation / Benefits Calculation

### 🚀 Execution Checklist

#### 1. Protobuf Contract & Schema
- [ ] Define `.proto` payload in monorepo root.
- [ ] Ensure 64-bit integer fields map to native strings (`ts-proto` / Maven).

#### 2. Java Command Path (Spring Boot)
- [ ] Convert legacy primitive logic in `Assets.java` or `Balance.java` into a Command Handler.
- [ ] Replace `double` calculations with arbitrary-precision handling.
- [ ] Publish event to Apache Kafka log.

#### 3. Upcaster Engine (If applicable)
- [ ] Implement `V1ToV2` in-memory upcaster if modifying historical payload schemas.

#### 4. TypeScript Read Path (GraphQL / MongoDB)
- [ ] Implement Kafka projection consumer for MongoDB read store.
- [ ] Expose updated read models via GraphQL API.
