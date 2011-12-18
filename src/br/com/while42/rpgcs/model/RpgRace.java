package br.com.while42.rpgcs.model;

import android.content.Context;
import br.com.while42.rpgcs.R;

public enum RpgRace {
	HUMAN{
		public String toString(Context ctx) {
			return ctx.getString(R.string.human);
		}
	},
    ELF{
		public String toString(Context ctx) {
			return ctx.getString(R.string.elf);
		}
	},
    DWARF{
		public String toString(Context ctx) {
			return ctx.getString(R.string.dwarf);
		}
	},
    HALFLING{
		public String toString(Context ctx) {
			return ctx.getString(R.string.halfling);
		}
	}, 
    HALF_ELF{
		public String toString(Context ctx) {
			return ctx.getString(R.string.half_elf);
		}
	},
    HALF_ORC{
		public String toString(Context ctx) {
			return ctx.getString(R.string.half_orc);
		}
	}, 
    GNOME{
		public String toString(Context ctx) {
			return ctx.getString(R.string.gnome);
		}
	}
}
