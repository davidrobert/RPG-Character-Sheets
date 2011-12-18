package br.com.while42.rpgcs.model;

import android.content.Context;
import br.com.while42.rpgcs.R;

public enum RpgClass {
	BARBARIAN{
		public String toString(Context ctx) {
			return ctx.getString(R.string.barbarian);
		}
	}, 
	BARD,
	CLERIC{
		public String toString(Context ctx) {
			return ctx.getString(R.string.bard);
		}
	},
	DRUID{
		public String toString(Context ctx) {
			return ctx.getString(R.string.druid);
		}
	},
	FIGHTER{
		public String toString(Context ctx) {
			return ctx.getString(R.string.fighter);
		}
	},
	MONK{
		public String toString(Context ctx) {
			return ctx.getString(R.string.monk);
		}
	},
	PALADIN{
		public String toString(Context ctx) {
			return ctx.getString(R.string.paladin);
		}
	},
	RANGER{
		public String toString(Context ctx) {
			return ctx.getString(R.string.ranger);
		}
	},
	ROGUE{
		public String toString(Context ctx) {
			return ctx.getString(R.string.rogue);
		}
	},
	SORCERER{
		public String toString(Context ctx) {
			return ctx.getString(R.string.sorcerer);
		}
	},
	WIZARD{
		public String toString(Context ctx) {
			return ctx.getString(R.string.wizard);
		}
	}
}
