; Script generated by the Inno Setup Script Wizard.
; SEE THE DOCUMENTATION FOR DETAILS ON CREATING INNO SETUP SCRIPT FILES!

[Setup]
; NOTE: The value of AppId uniquely identifies this application.
; Do not use the same AppId value in installers for other applications.
; (To generate a new GUID, click Tools | Generate GUID inside the IDE.)
AppId={{13A0EAFD-F9DB-4252-86CD-1052AFD8B8B9}
AppName=CaesarCode
AppVersion=1.0
;AppVerName=CaesarCode 1.0
AppPublisher=My Company, Inc.
AppPublisherURL=http://www.example.com/
AppSupportURL=http://www.example.com/
AppUpdatesURL=http://www.example.com/
DefaultDirName={pf}\CaesarCode
DisableProgramGroupPage=yes
OutputDir=D:\TechnicalPhysics\CaesarCodeJFX
OutputBaseFilename=setup
Compression=lzma
SolidCompression=yes

[Languages]
Name: "english"; MessagesFile: "compiler:Default.isl"
Name: "russian"; MessagesFile: "compiler:Languages\Russian.isl"

[Tasks]
Name: "desktopicon"; Description: "{cm:CreateDesktopIcon}"; GroupDescription: "{cm:AdditionalIcons}"; Flags: unchecked

[Files]
Source: "D:\TechnicalPhysics\CaesarCodeJFX\out\artifacts\CaesarCodeJFX_jar\CaesarCodeJFX.exe"; DestDir: "{app}"; Flags: ignoreversion
Source: "D:\TechnicalPhysics\CaesarCodeJFX\out\artifacts\CaesarCodeJFX_jar\Caesar.bmp"; DestDir: "{app}"; Flags: ignoreversion
; NOTE: Don't use "Flags: ignoreversion" on any shared system files

[Icons]
Name: "{commonprograms}\CaesarCode"; Filename: "{app}\CaesarCodeJFX.exe"
Name: "{commondesktop}\CaesarCode"; Filename: "{app}\CaesarCodeJFX.exe"; Tasks: desktopicon

[Run]
Filename: "{app}\CaesarCodeJFX.exe"; Description: "{cm:LaunchProgram,CaesarCode}"; Flags: nowait postinstall skipifsilent

