# DungeonMaster - Assignment 1

[![standard-readme compliant](https://img.shields.io/badge/standard--readme-OK-green.svg?style=flat-square)](https://github.com/RichardLitt/standard-readme)

This repository contains the first assignment of the Java Fullstack course at Noroff Accelerate.

## Table of Contents

- [Overview](#overview)
- [Structure and Logic](#structure-and-logic)
  - [DungeonMaster](#dungeonmaster)
    - [Hero Package](#hero-package)
      - [Hero Class](#hero-class)
      - [HeroAttributes Class](#heroattributes-class)
    - [Items Package](#items-package)
      - [Item Class](#item-class)
      - [ItemSlot Enum Class](#itemslot-enum-class)
      - [Armor Package](#armor-package)
        - [Armor Class](#armor-class)
        - [ArmorType Enum Class](#armortype-enum-class)
        - [InvalidArmorException Class](#invalidarmorexception-class)
      - [Weapon Package](#weapon-package)
        - [Weapon Class](#weapon-class)
        - [WeaponType Enum Class](#weapontype-enum-class)
        - [InvalidWeaponException Class](#invalidweaponexception-class)
    - [ConsoleColors Class](#consolecolors-class)
    - [Main Class](#main-class)

## Overview

This assignment is part of the Java Fullstack course at Noroff Accelerate. It involves creating a DungeonMaster program that manages heroes, their attributes, items, armor, and weapons. The program uses a structured class hierarchy to represent different hero types and items.

## Structure and Logic

### DungeonMaster

#### Hero Package

The `hero` package contains a package of hero types and classes related to different managing heroes:

- `Hero`: The base abstract class for different hero types.
- `Archer`, `Barbarian`, `Swashbuckler`, and `Wizard`: Subclasses that extends the `Hero` class, each representing a specific hero type.

#### HeroAttributes Class

The `HeroAttributes` class initializes the object that contains the attributes of a hero, being strength, dexterity, and intelligence.

### Items Package

The `items` package contains classes related to armor, and weapons:

- `Item`: The base class for different types of items.
- `ItemSlot`: An enum class representing different slots where items can be equipped.

#### Armor Package

The `armor` package contains classes related to armor:

- `Armor`: Represents a piece of armor that a hero can equip.
- `ArmorType`: An enum class representing different types of armor.
- `InvalidArmorException`: An exception class for handling invalid armor operations.

#### Weapon Package

The `weapon` package contains classes related to weapons:

- `Weapon`: Represents a weapon that a hero can equip.
- `WeaponType`: An enum class representing different types of weapons.
- `InvalidWeaponException`: An exception class for handling invalid weapon operations.

### ConsoleColors Class

The `ConsoleColors` class provides constants for styling console output with colors.

### Main Class

The `Main` class is the entry point of the program. It initializes heroes, items, armor, and weapons, and demonstrates various interactions between them.

 
MIT © 2023 Egil Hagen