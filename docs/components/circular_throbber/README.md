# Circular Throbber

Following are the different variants of Circular Throbber available in this library:

## Ripple

A circle whose radius and alpha value is animated to give a ripple effect.

### Properties

- `color` - sets the color of the ripple.
  default: primary color from Material Theme.

<details open>
<summary>sample</summary>
<img src="./images/Ripple.gif" alt="Ripple" height="240"/>
</details>

## Web

An animated gradient circular ring which gives the appearance of circular throbbers on most web
applications.

### Properties

- `color` - sets the color of the gradient circular ring.
  default: primary color from Material Theme.
- `strokeWidth` - sets the width of the circular gradient ring.
  default: 4.dp
- `deflectionAngle` - sets the angle by which the start position of the throbber's animation needs
  to be deflected.
  default: 0f

<details open>
<summary>sample</summary>
<img src="./images/Web.gif" alt="Web" height="240"/>
</details>

## Windows

An animated circular ring whose circumference is animated to give the appearance of circular
throbbers from windows devices.

### Properties

- `color` - sets the color of the circular ring.
  default: primary color from Material Theme.
- `trackColor` - sets the color of the circular ring's track.
  default: transparent.
- `strokeWidth` - sets the width of the circular ring.
  default: 4.dp
- `deflectionAngle` - sets the angle by which the start position of the throbber's animation needs
  to be deflected.
  default: 0f

<details open>
<summary>sample</summary>
<img src="./images/Windows.gif" alt="Windows" height="240"/>
</details>

## Legacy

Eight dots arranged in circle which expand and shrink in a succession giving the effect of it
rotating clockwise.

### Properties

- `color` - sets the color of each dot.
  default: primary color from Material Theme.
- `dotRadius` - sets the radius of each dot.
  default: 4.dp

<details open>
<summary>sample</summary>
<img src="./images/Legacy.gif" alt="Legacy" height="240"/>
</details>