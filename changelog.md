# Changelog

## 1.0.0 — Initial commit
- Initial project scaffold and README.
- Added basic ECS skeleton:
    - Entities: Entity, EntityManager
    - Components: placeholder package
    - Systems: System stub
- Core application UI:
    - Main launcher, Game, GamePanel (window + rendering panel setup)
- Project metadata:
    - .gitignore
    - README.md

## 1.0.1 — Initial Engine
- Trial and error for ECS Engine
    - Entity creation via Entity Manager seems fine for now
    - Rendering system needs fixing
- Relearning Java Graphics Libraries
- Renamed src folders to appropriate Java convention
- Reusing old project sprite for testing purposes

## 1.0.2 — Initial Engine
- Trial and error for ECS Engine
    - Entity creation via Entity Manager seems fine for now
    - Rendering system fixed
- Component API buggy, getting component (BufferedImage) returns null

## 1.0.3 — Initial Engine
- Deleted most of the systems and initial gamepanel
- - the architectural structure i chose is too complicated 
- - will rebuild from scratch
- Debugged entity creation, for now Position is working



### Known issues / limitations
- No game loop, input handling, or concrete components/systems implemented yet.
- Component API, specifically Sprite is not working properly
- No tests or build scripts included.
- Entities currently use runtime-type mapping for components — consider component IDs or bitmasks for performant queries later.
