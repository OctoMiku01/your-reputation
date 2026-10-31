# Your Reputation

> [!WARNING]
> **AI disclaimer:** The port to Minecraft 26.x was written by AI (Claude, by Anthropic). The maintainer directs what
> it does, but does not review the code itself. Please report problems as an issue.
>
> This is an unofficial port and is mainly made for private use. You are welcome to try it, but it comes without any
> promise of support. Please do not report problems with it to the original author.

Your Reputation is a [Jade](https://modrinth.com/mod/jade) plugin that displays your reputation on the villagers' tooltips. Minecraft 26.3 and 26.2, Fabric.

This is a port of [Your Reputation](https://github.com/Aton-Kish/your-reputation) by Aton-Kish. For Minecraft 1.21.10 and older, use the [original mod](https://modrinth.com/mod/your-reputation-jade).

| Reputation  | Value                          | Tooltip                                  |
| ----------- | ------------------------------ | ---------------------------------------- |
| Friendly    | 100 or more                    | ![friendly](./images/friendly.png)       |
| Trustworthy | more than 0 and less than 100  | ![trustworthy](./images/trustworthy.png) |
| Neutral     | equal to 0                     | ![neutral](./images/neutral.png)         |
| Suspicious  | more than -100 and less than 0 | ![suspicious](./images/suspicious.png)   |
| Hostile     | -100 or less                   | ![hostile](./images/hostile.png)         |

If your reputation is "Hostile", villagers will become snitches.

![snitch](./images/snitch.png)

And then, iron golems will get angry and start attacking you...

![angry golem](./images/angry_golem.png)

## Installation

Needs [Fabric Loader](https://fabricmc.net/), [Fabric API](https://modrinth.com/mod/fabric-api), [Jade](https://modrinth.com/mod/jade) and Java 25. Download the jar for your Minecraft version from the [releases](https://github.com/OctoMiku01/your-reputation/releases) and put it into the `mods` folder, on both the client and the server.

## Versions

| Minecraft | Branch                                                                 |
| --------- | ---------------------------------------------------------------------- |
| 26.3      | [`main`](https://github.com/OctoMiku01/your-reputation/tree/main)       |
| 26.2      | [`mc/26.2`](https://github.com/OctoMiku01/your-reputation/tree/mc/26.2) |

## License

Your Reputation mod is licensed under the MIT License, see [LICENSE](./LICENSE). The original mod is copyright (c) 2022 Aton-Kish.
