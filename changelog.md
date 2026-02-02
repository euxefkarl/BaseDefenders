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

### Known issues / limitations
- No game loop, input handling, rendering pipeline, or concrete components/systems implemented yet.
- No tests or build scripts included.
- Entities currently use runtime-type mapping for components — consider component IDs or bitmasks for performant queries later.

### Next steps
- Implement core components (Transform, Renderable, Health, AI, etc.).
- Add game loop (fixed-step), rendering pipeline, and input management.
- Design system scheduler and entity query mechanism (bitmask / archetypes).
- Add unit/integration tests and basic asset pipeline.
