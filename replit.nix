{ pkgs }: {
  deps = [
    pkgs.qtile
    pkgs.zulu
    pkgs.maven
    pkgs.nodePackages.vscode-langservers-extracted
    pkgs.nodePackages.typescript-language-server
  ];
}