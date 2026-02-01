# Git Tips

- [Git Tips](#git-tips)
  - [Git Submodule Sparse-Checkout](#git-submodule-sparse-checkout)

---

## Git Submodule Sparse-Checkout

1. Locate at the root
2. Add submodule you want to sparse-checkout
   - `git submodule add <repository-url> <path>`
3. Go to submodule path
   - `cd <path>`
4. Instantiate `sparse-checkout` feature
   - `git sparse-checkout init --cone`
5. Set required sparse-checkout directory
   - `git sparse-checkout set <required-directory>`
6. Update the submodule
   - `cd ..`
   - git submodule update --force --checkout <path>

Total Flow
```bash
git submodule add <repository-url> <path>

cd <path>
git sparse-checkout init --cone

git sparse-checkout set <required-directory>

cd ..
git submodule update --force --checkout <path>
```