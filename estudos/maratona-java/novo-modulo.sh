#!/usr/bin/env bash
# Uso: ./novo-modulo.sh 07-classes
set -euo pipefail
mod="$1"
dir="$(cd "$(dirname "$0")" && pwd)"

mkdir -p "$dir/$mod/src"

cat > "$dir/$mod/$mod.iml" <<EOF
<?xml version="1.0" encoding="UTF-8"?>
<module type="JAVA_MODULE" version="4">
  <component name="NewModuleRootManager" inherit-compiler-output="true">
    <exclude-output />
    <content url="file://\$MODULE_DIR\$">
      <sourceFolder url="file://\$MODULE_DIR\$/src" isTestSource="false" />
    </content>
    <orderEntry type="inheritedJdk" />
    <orderEntry type="sourceFolder" forTests="false" />
  </component>
</module>
EOF

entry="      <module fileurl=\"file://\$PROJECT_DIR\$/$mod/$mod.iml\" filepath=\"\$PROJECT_DIR\$/$mod/$mod.iml\" />"
sed -i "s#</modules>#${entry}\n    </modules>#" "$dir/.idea/modules.xml"

echo "Modulo '$mod' criado. Feche e reabra o projeto no IntelliJ (ou File > Reload)."
