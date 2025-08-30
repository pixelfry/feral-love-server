{pkgs ? import <nixpkgs> {}}:
  
  pkgs.mkShell {
    nativeBuildInputs = [
      autoPatchelfHook
  ];
 
    buildInputs = with pkgs; [
      pkgs.jetbrains.idea-community
      pkgs.jdk24
      pkgs.maven   
  ];
}
